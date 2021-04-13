package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CatTrick_39160 : Card() {
    override val id = 39160
    override val name = "豹子戏法"
    override val description = "<b>奥秘：</b>在你的对手施放一个法术后，召唤一只4/2并具有<b>潜行</b>的猎豹。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Karazhan
    override val background = "我最近学了新的戏法，都是很棒的戏法，就连麦迪文也没有见识过。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c76125f7a71c2651cfde37a675950ada12b531bf2ba54dc894b444c98f2426ad.png"
}
