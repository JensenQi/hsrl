package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JunglePanther_69816 : Card() {
    override val id = 69816
    override val name = "丛林猎豹"
    override val description = "<b>潜行</b>"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "荆棘谷是一个很适合观光的地方，但你绝对不会想住在那儿。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b38d9de03876b892f1c72e12bb4afab4162b3ba341d65e49a02cfbdd649ee31e.png"
}
