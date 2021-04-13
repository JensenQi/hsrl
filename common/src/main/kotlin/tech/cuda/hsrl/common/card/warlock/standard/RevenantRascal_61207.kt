package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RevenantRascal_61207 : Card() {
    override val id = 61207
    override val name = "怨灵捣蛋鬼"
    override val description = "<b>战吼：</b>摧毁每个玩家的一个法力水晶。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "事实证明：鬼脸做久了，脸真的会僵住。"
    override val artist = "Cheng Hao"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2ae2624600494a81fad0048066b7f8d030ebcb2f52c946a8c5d4100ff43ba2b5.png"
}
