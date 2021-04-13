package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BellringerSentry_47405 : Card() {
    override val id = 47405
    override val name = "警钟哨卫"
    override val description = "<b>战吼，亡语：</b>将一个<b>奥秘</b>从你的牌库中置入战场。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.TheWitchwood
    override val background = "他是吉尔尼斯教堂的敲钟人。外表丑陋异常，但心地却极其善良。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/756c085079d40e622361e0d0a5054cc6d0f98d9a1f4e6d37030853c5f36e3b3b.png"
}
