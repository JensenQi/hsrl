package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KnightOfAnointment_62924 : Card() {
    override val id = 62924
    override val name = "圣礼骑士"
    override val description = "<b>战吼：</b>抽一张神圣法术牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“我封你为……伤员。”"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/659e995b57dc59b5cc895afbe9c2f12c5e89881b5662815a3837ba05fcf4ce61.png"
}
