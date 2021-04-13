package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ImprisonedScrapImp_56519 : Card() {
    override val id = 56519
    override val name = "被禁锢的拾荒小鬼"
    override val description = "<b>休眠</b>两回合。唤醒时，使你手牌中的所有随从牌获得+2/+1。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.AshesOfOutland
    override val background = "铁鬼截铁轨，铁贵携铁归。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/86977cfad6a8f990b1d5881db193ef56b277c7f421fe6736fbe60e126d84430a.png"
}
