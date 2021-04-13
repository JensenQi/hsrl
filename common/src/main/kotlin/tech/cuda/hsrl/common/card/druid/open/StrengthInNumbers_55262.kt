package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StrengthInNumbers_55262 : Card() {
    override val id = 55262
    override val name = "人多势众"
    override val description = "<b>支线任务：</b> 消耗10点法力值用于随从牌上。<b>奖励：</b>从你的牌库中召唤一个随从。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.DescentOfDragons
    override val background = "一个随从，两个随从……树个随从！"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/36cae4f93458d0462208dbf0cc4092d5d354b855979daed4125d905977a0bb8e.png"
}
