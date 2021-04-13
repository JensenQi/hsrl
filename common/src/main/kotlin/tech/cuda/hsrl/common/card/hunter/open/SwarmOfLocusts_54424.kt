package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SwarmOfLocusts_54424 : Card() {
    override val id = 54424
    override val name = "飞蝗虫群"
    override val description = "召唤七只1/1并具有<b>突袭</b>的 蝗虫。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "蝗虫一拥而至，好事从不成群。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/34467de897da9a8694ce5fa96026a4240dfc0be1b0a6f7a90cb6b4c10b00add6.png"
}
