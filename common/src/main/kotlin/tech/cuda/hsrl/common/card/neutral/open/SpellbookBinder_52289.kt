package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpellbookBinder_52289 : Card() {
    override val id = 52289
    override val name = "魔法订书匠"
    override val description = "<b>战吼：</b>如果你拥有<b>法术伤害</b>，抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "你一订会爱上他的书！"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9934f4055936dac8b33161caae33723a7009a803b8d4f10a19612af8591cd304.png"
}
