package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ConjurersCalling_51971 : Card() {
    override val id = 51971
    override val name = "咒术师的召唤"
    override val description = "<b>双生法术</b> 消灭一个随从。召唤两个法力值消耗相同的随从来替换它。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RiseOfShadows
    override val background = "不要回答！不要回答！不要回答！"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/57d2346ca68e2fa55b2f0e072349351d280500673ac00c1de253524ffa9b923a.png"
}
