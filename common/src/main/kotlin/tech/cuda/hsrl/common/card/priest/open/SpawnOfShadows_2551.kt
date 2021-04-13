package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpawnOfShadows_2551 : Card() {
    override val id = 2551
    override val name = "暗影子嗣"
    override val description = "<b>激励：</b>对每个英雄造成4点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Tgt
    override val background = "只要跟暗影两字沾边的，多半不是什么好人，也不会有什么好事。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/582b4797f500e2f9a79c9e748f48c3465b9a9bdecda3fc37d4e63052d774f9c1.png"
}
