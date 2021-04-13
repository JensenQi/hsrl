package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Secretkeeper_69837 : Card() {
    override val id = 69837
    override val name = "奥秘守护者"
    override val description = "每当有一张<b>奥秘</b>牌被使用时，便获得+1/+1。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "她永远也不会告诉你曼科里克的妻子在哪里。"
    override val artist = "Evgeniy Zagumyenny"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8e2bdbb1b4bc92e40499fc2b60956148f784063fee137cd0bd21183a6a32eb93.png"
}
