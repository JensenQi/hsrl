package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LesserJasperSpellstone_43288 : Card() {
    override val id = 43288
    override val name = "小型法术玉石"
    override val description = "对一个随从造成 2点伤害。 <i>（获得3点护甲值后升级。）</i>"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "“古老森林中的精灵们用魔石抵抗恶魔的诅咒。阴影散去，但仇恨仍在，脆弱的灵魂遭到扭曲。精灵长出了角与蹄，他们的森林开始燃烧。”——《魔石》"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/661ded50c00a9b62c7def783893f6e9f5dcc95aca9d55c23ed11b67234cee583.png"
}
