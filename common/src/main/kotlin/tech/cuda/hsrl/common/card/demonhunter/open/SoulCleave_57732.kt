package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SoulCleave_57732 : Card() {
    override val id = 57732
    override val name = "灵魂裂劈"
    override val description = "<b>吸血</b> 随机对两个敌方随从造成 2点伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Legacy1635
    override val background = "想抓住恶魔的魂，先抓出它的胃。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/15530013f663ee6aec064a2278c43f81939764c2eb8b81215be456c3900a3968.png"
}
