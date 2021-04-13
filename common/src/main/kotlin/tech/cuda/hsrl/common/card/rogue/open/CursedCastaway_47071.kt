package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CursedCastaway_47071 : Card() {
    override val id = 47071
    override val name = "被诅咒的海盗"
    override val description = "<b>突袭，亡语：</b> 从你的牌库中抽一张<b>连击</b>牌。"
    override var cost: Int? = 6
    override var health: Int? = 3
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.TheWitchwood
    override val background = "她本是一名船难者……直到她找到一个被诅咒的排球。"
    override val artist = "Tyler West Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/835f8fdf90fbfa2e671ffcad1a965d4ff2785bef99d833e6435f7a33dd6c1559.png"
}
