package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SunscaleRaptor_62811 : Card() {
    override val id = 62811
    override val name = "赤鳞迅猛龙"
    override val description = "<b>暴怒：</b>将一张赤鳞迅猛龙洗入你的牌库并使其永久获得+2/+1。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "虽我之死，有子存焉。子又生孙，孙又生子，子又有子，子又有孙，孙又生子，子又有子，子又有孙，孙又生子，子又有子，子又有孙……"
    override val artist = "Melvin Chan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9df6ea47756685c86839c17e842ab90e6d89966f028f8292b657ffb62a0d28fc.png"
}
