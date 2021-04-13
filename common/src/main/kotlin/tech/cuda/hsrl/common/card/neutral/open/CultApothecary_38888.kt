package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CultApothecary_38888 : Card() {
    override val id = 38888
    override val name = "异教药剂师"
    override val description = "<b>战吼：</b>每有一个敌方随从，便为你的英雄恢复 2点生命值。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "即便是异教徒也得找人看病吃药。"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/046d0c5fbc4a7a8ed3bfe81321c9497a378ff460275374f7ba7702fe04be0fea.png"
}
