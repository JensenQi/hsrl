package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrizeVendor_61622 : Card() {
    override val id = 61622
    override val name = "奖品商贩"
    override val description = "<b>战吼：</b>每个玩家抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "他只是想确认奖券是不是真的。正品奖券是草莓味的。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f4b2d1bf11dd393a03409565a1d2b93598516a792d410f04cd77126f4e014f20.png"
}
