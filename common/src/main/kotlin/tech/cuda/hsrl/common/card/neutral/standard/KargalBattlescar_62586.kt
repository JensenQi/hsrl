package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KargalBattlescar_62586 : Card() {
    override val id = 62586
    override val name = "卡加尔·战痕"
    override val description = "<b>战吼：</b>在本局对战中，你每召唤过一个哨所，便召唤一个5/5的哨兵。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "一声号响，备战陆上；两声号响，备战林中。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/57ef77d09e121e3adfaf2f6f1a4a8cd4dfd2cce1c8cfed5c8399cdba18eae234.png"
}
