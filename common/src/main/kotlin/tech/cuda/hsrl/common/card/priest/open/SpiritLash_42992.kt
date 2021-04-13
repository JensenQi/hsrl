package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpiritLash_42992 : Card() {
    override val id = 42992
    override val name = "灵魂鞭笞"
    override val description = "<b>吸血</b> 对所有随从造成 1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Kotf
    override val background = "你们的灵魂都是我的。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4a96c2cc64127093da3f005e68ada40ebceeff1bd3e8cfa7e8cb6e59e51e1c4f.png"
}
