package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncestralHealing_149 : Card() {
    override val id = 149
    override val name = "先祖治疗"
    override val description = "为一个随从恢复所有生命值并使其获得<b>嘲讽</b>。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy1635
    override val background = "你能在战斗中召唤祖先的灵魂！所以，出生在一个强大的家族是很重要的！"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eb8cc1c386de37096ef7a5c8ee2b8abfae802d7e7ed21d410c838d22a63dc330.png"
}
