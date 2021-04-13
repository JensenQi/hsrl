package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PredatoryInstincts_49994 : Card() {
    override val id = 49994
    override val name = "掠食本能"
    override val description = "从你的牌库中抽一张野兽牌。将其生命值翻倍。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RastakhansRumble
    override val background = "先来两个开胃菜。"
    override val artist = "Clint Langley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/23a6fbd72d1cebfebfed9c610b6d424727ba5ead7d4b7af2e4e515d0e39c56f6.png"
}
