package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ApexisSmuggler_56461 : Card() {
    override val id = 56461
    override val name = "埃匹希斯走私犯"
    override val description = "在你使用一张<b>奥秘</b>牌后，<b>发现</b>一张 法术牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“奥，奥秘？我可没有啊！诶，快看，这儿有个法术！”"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9b54da2857ea3f3bdf0209d731d6b4ce7384b1d394a2034c467510322ccaae28.png"
}
