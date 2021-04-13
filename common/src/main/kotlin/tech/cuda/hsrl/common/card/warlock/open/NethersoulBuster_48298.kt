package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NethersoulBuster_48298 : Card() {
    override val id = 48298
    override val name = "虚魂破坏者"
    override val description = "<b>战吼：</b>在本回合中，你的英雄每受到一点伤害，便获得+1攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.BoomsdayProject
    override val background = "恶魔横渡溪流，所为何事？不过是为了回到另一个世界。"
    override val artist = "Nicola Saviori"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ab2de5e43efc97a82ddb782c4792de6bed55d18d1160292280acabeee691e934.png"
}
