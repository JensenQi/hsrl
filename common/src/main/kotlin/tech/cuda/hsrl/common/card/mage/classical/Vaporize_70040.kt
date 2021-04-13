package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Vaporize_70040 : Card() {
    override val id = 70040
    override val name = "蒸发"
    override val description = "<b>奥秘：</b>当一个随从攻击你的英雄，将其消灭。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "是不是因为死亡之翼的对手使用这张牌击败了他，所以他一怒之下引发了大灾变？我们不得而知。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cd42eee269d133a5cfd55b5b0132b2e4276d093dad47e7ec76af704262af5aa5.png"
}
