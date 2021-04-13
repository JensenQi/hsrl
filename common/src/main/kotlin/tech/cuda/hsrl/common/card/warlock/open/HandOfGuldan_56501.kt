package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HandOfGuldan_56501 : Card() {
    override val id = 56501
    override val name = "古尔丹之手"
    override val description = "当你使用或弃掉这张牌时，抽三张牌。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.AshesOfOutland
    override val background = "古尔丹的脑袋也能抽三张牌。你想想，要是他用全身抽牌，那得抽多少！"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/32235ec237dd2991953980aa2b13969b0592297b205b23efe9c066fd5d6ab45c.png"
}
