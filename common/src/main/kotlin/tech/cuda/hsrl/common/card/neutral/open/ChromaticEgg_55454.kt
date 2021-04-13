package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ChromaticEgg_55454 : Card() {
    override val id = 55454
    override val name = "多彩龙卵"
    override val description = "<b>战吼：</b>秘密<b>发现</b>一条龙作为孵化对象。 <b>亡语：</b>破壳而出！"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "奈法利安的造物中有两种最为知名：凶猛恐怖的怪物和花样繁多的早餐。"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0a3aa38efc89856bbf96647bc79539005ca19277164ff4d473d7cd7eb3c2a7d6.png"
}
