package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RenounceDarkness_38461 : Card() {
    override val id = 38461
    override val name = "弃暗投明"
    override val description = "将你的英雄技能和术士卡牌替换成另一职业的。这些牌的法力值消耗减少（1）点。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Wotog
    override val background = "我以前没得选择，现在我想做一个好人。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9477b28ef0120767b34cd5ade5a9f6a3326d9e226553e83e08cc0c10c198515d.png"
}
