package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IronforgePortal_39747 : Card() {
    override val id = 39747
    override val name = "铁炉堡传送门"
    override val description = "获得4点护甲值。随机召唤一个法力值消耗为（4）的 随从。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Karazhan
    override val background = "铁炉堡坐落在白雪皑皑的丹莫罗山顶，是艾泽拉斯联盟矮人和侏儒的主城。"
    override val artist = "Nate Bowden"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/662f18ad52e3e03b555b26b18bef580773d05c661d9ad020bca991c15ccea01c.png"
}
