package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WickedSkeleton_45328 : Card() {
    override val id = 45328
    override val name = "邪骨骷髅"
    override val description = "<b>战吼：</b>在本回合中每有一个随从死亡，便获得+1/+1。"
    override var cost: Int? = 4
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "受限于生理构造，他注定无法成为一个好的饶舌歌手。"
    override val artist = "Nicola Saviori"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/83ca1922bf0168fababfa394ac446b5e94d6915860754958701ded3607d15177.png"
}
