package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Swindle_61159 : Card() {
    override val id = 61159
    override val name = "行骗"
    override val description = "抽一张法术牌。<b>连击：</b>并抽一张随从牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "有一个地方，毛绒玩具卖得很便宜，你懂的……"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c459b81eb742ac8a2c5ed63f1609dedaac44841dfd382fd7f5a84574a6ee8ae5.png"
}
