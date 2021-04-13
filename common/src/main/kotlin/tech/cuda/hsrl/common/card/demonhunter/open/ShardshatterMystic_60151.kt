package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShardshatterMystic_60151 : Card() {
    override val id = 60151
    override val name = "残片震爆秘术师"
    override val description = "<b>战吼：</b>摧毁一张你牌库中的灵魂残片，对所有其他随从造成3点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "感受这震撼灵魂的伤害吧。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7b111dafe4da6c5efc22cc8606ee47e72936872a8af3e43b269ce5840d10d83a.png"
}
