package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneFletcher_52072 : Card() {
    override val id = 52072
    override val name = "奥术弓箭手"
    override val description = "每当你使用一张法力值消耗为（1）的随从牌，从你的牌库中抽一张法术牌。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.RiseOfShadows
    override val background = "别贩箭，千万别贩箭。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/615ac1e0958ddd2632e17ba3fa2b1e7fcda64b715ec64065e9ce4e0ad8465d7e.png"
}
