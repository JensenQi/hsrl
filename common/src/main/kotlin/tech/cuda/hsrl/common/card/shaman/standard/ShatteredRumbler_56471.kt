package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShatteredRumbler_56471 : Card() {
    override val id = 56471
    override val name = "破碎奔行者"
    override val description = "<b>战吼：</b> 如果你在上个回合施放过法术，则对所有其他随从造成2点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.AshesOfOutland
    override val background = "刚才那个法术，气死我了！"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bc23f1fb80f40a2ad3da397b66c604b064ade2b6457590a8ec203b0a96cf4e3a.png"
}
