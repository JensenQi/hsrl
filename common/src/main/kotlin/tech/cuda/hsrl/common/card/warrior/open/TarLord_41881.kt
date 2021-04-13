package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TarLord_41881 : Card() {
    override val id = 41881
    override val name = "焦油兽王"
    override val description = "<b>嘲讽</b> 在你对手的回合获得+4攻击力。"
    override var cost: Int? = 7
    override var health: Int? = 11
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Ungoro
    override val background = "焦油兽王，老兄…我可是传奇怪物啊！噢，算了吧。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/44c3b40110fd32b2c40a48f5e60b5595c298acb11b75a8194da45a483e3d0953.png"
}
