package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AldorTruthseeker_56556 : Card() {
    override val id = 56556
    override val name = "奥尔多真理追寻者"
    override val description = "<b>嘲讽，战吼：</b> 在本局对战中，你的圣契的法力值消耗减少（2）点。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.AshesOfOutland
    override val background = "真理在圣契范围之内。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7b6671bdae31cbf3c6edb7a32bf96b7cd4d66a56a831cf2f548131bfc8ea633c.png"
}
