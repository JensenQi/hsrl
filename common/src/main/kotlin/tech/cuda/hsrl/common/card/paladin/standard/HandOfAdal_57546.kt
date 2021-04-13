package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HandOfAdal_57546 : Card() {
    override val id = 57546
    override val name = "阿达尔之手"
    override val description = "使一个随从获得+2/+2。 抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.AshesOfOutland
    override val background = "让我与你握别，再轻轻抽出我的牌。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/54e745c6f1b53115752bb92294f9fdf65dab3c06368cc7e948ed9329d5a08070.png"
}
