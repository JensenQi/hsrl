package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PlaguemawTheRotting_63042 : Card() {
    override val id = 63042
    override val name = "腐烂的普雷莫尔"
    override val description = "在一个友方<b>嘲讽</b>随从死亡后，召唤一个它的不具有<b>嘲讽</b>的新的 复制。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "<i>这</i>就是你每天要刷牙三次的原因！"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/139008ce52d45beb3f81fdf7fcb4044dba14a3b5056e9974a7118cc60c72c19c.png"
}
