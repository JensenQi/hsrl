package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BumperCar_61242 : Card() {
    override val id = 61242
    override val name = "碰碰车"
    override val description = "<b>突袭，亡语：</b>将两张1/1并具有<b>突袭</b>的乘客置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "<i>警告：该车随时可能爆炸。</i>"
    override val artist = "Ursula Dorada"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0f43b252106619e3b7e48484e76ae795fcbe49bd7412fd2f5bc319c8d044fef5.png"
}
