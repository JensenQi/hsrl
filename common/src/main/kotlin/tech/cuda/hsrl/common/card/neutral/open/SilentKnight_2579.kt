package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SilentKnight_2579 : Card() {
    override val id = 2579
    override val name = "沉默的骑士"
    override val description = "<b>潜行</b> <b>圣盾</b>"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "他曾是图书管理员，少言寡语早已成了习惯。"
    override val artist = "Esad Ribic"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fb0f887e24f3336de9b2aff3da4679617cfb1bed348fcce6b38d23c90626a26e.png"
}
