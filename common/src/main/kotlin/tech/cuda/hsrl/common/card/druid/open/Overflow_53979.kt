package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Overflow_53979 : Card() {
    override val id = 53979
    override val name = "溢流"
    override val description = "为所有角色恢复 5点生命值。抽五张牌。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "恢复悠悠，抽牌匆匆，潮起又潮落。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c5f0361cd117927bb92763470870de75233a9d0b5f78b862f95a77c400eaee16.png"
}
