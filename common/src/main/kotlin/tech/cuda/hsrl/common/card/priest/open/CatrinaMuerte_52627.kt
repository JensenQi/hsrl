package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CatrinaMuerte_52627 : Card() {
    override val id = 52627
    override val name = "亡者卡特琳娜"
    override val description = "在你的回合结束时，召唤一个在本局对战中死亡的友方随从。"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RiseOfShadows
    override val background = "“来参加我的死亡派对吧。”"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/85d1a1f961013ff26de76cdceb20a8f5e6d5edd29410bc6cc6821fe4d184593a.png"
}
