package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpectralCutlass_47594 : Card() {
    override val id = 47594
    override val name = "幽灵弯刀"
    override val description = "<b>吸血</b> 每当你使用一张另一职业的卡牌时，获得+1耐久度。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.TheWitchwood
    override val background = "在一款名叫《水果幽灵》的游戏里可是收费道具！"
    override val artist = "Nutchapol Thitinunthakorn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b800352845bab61fbd59e33cee57dec573d6b3f86741c1bef2c920834a1a352b.png"
}
