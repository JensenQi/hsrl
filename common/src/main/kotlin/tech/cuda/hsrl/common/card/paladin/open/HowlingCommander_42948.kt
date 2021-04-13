package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HowlingCommander_42948 : Card() {
    override val id = 42948
    override val name = "咆哮的指挥官"
    override val description = "<b>战吼：</b>从你的牌库中抽一张具有<b>圣盾</b>的随从牌。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Kotf
    override val background = "她的营在征兵时会附送好几对耳塞。"
    override val artist = "Mike Azevedo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/12b00bd9495a8f7be22fbb1798eae5a7540bb8698b2e22e3494b66d88e804c93.png"
}
