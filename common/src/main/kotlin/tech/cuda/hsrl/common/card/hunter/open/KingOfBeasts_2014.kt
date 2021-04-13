package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KingOfBeasts_2014 : Card() {
    override val id = 2014
    override val name = "百兽之王"
    override val description = "<b>嘲讽，战吼：</b>你每控制一个其他野兽，便获得+1攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Gvg
    override val background = "一声长啸百兽惊，贫瘠之地留威名。"
    override val artist = "Seamus Gallagher"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6c4d35849523744d3cd07075cd0daec43ec17bb24b05fcccbd381bb4fbcf3ad1.png"
}
