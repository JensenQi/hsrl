package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheNamelessOne_61208 : Card() {
    override val id = 61208
    override val name = "无名者"
    override val description = "<b>战吼：</b>选择一个随从，成为它的4/4复制，<b>沉默</b>目标随从。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "曾用名“ ，无名者”，但大家都理解不了。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6bfb8ca85220f25a6cf520ead003d1aa687bd5c88f10eea142d01c3dc9ed9d35.png"
}
