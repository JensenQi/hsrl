package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SilvermoonPortal_39716 : Card() {
    override val id = 39716
    override val name = "银月城传送门"
    override val description = "使一个随从获得+2/+2。随机召唤一个法力值消耗为（2）的随从。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Karazhan
    override val background = "和部落粗犷且朴素的整体风格相比，银月城可谓是东部王国的时尚之都。"
    override val artist = "Jimmy Lo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/232c3969eec96b69d4b1e1844554d285c122a511d1a33bc1742673657806013b.png"
}
