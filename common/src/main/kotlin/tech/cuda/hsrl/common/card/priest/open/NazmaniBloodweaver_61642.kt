package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NazmaniBloodweaver_61642 : Card() {
    override val id = 61642
    override val name = "纳兹曼尼织血者"
    override val description = "在你施放一个法术后，随机使你的一张手牌法力值消耗减少（1）点。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "织血者最初的艺名叫“茄织酱”，观众并不买账。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6c940e23cc62caa0ebef32b56942b3309cd65acca163b32b5c92c793ca443f92.png"
}
