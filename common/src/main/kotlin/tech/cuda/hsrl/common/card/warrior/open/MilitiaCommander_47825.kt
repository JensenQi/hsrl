package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MilitiaCommander_47825 : Card() {
    override val id = 47825
    override val name = "民兵指挥官"
    override val description = "<b>突袭，战吼：</b>在本回合获得+3攻击力。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.TheWitchwood
    override val background = "她的作战命令只需要两个词：“跟上！”和“给我咬！”"
    override val artist = "Tyler West Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7dfe357ac46886ab9c579ef27e0a1179aaf6bedae38476308de17914420c6859.png"
}
