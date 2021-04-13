package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheStormBringer_48161 : Card() {
    override val id = 48161
    override val name = "风暴聚合器"
    override val description = "随机将你的所有随从变形成为<b>传说</b>随从。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.BoomsdayProject
    override val background = "伊莱克特拉终于可以在家办公了。"
    override val artist = "J. Paick & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7e9fd50d6e3dde815402799b0c77818664325e38473015136d0400504423f399.png"
}
