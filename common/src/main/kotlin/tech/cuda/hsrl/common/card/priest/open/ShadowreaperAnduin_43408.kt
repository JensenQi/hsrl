package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowreaperAnduin_43408 : Card() {
    override val id = 43408
    override val name = "暗影收割者安度因"
    override val description = "<b>战吼：</b>消灭所有攻击力大于或等于5的随从。"
    override var cost: Int? = 8
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Kotf
    override val background = "“有一件事维伦从没教过我，我现在来告诉你：站在圣光面前的人……必将投下暗影。”"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4098f9d95f4400cdbf1c8f3d4abbf7678e8ed6c021be5b7bf26ac854467856ab.png"
}
