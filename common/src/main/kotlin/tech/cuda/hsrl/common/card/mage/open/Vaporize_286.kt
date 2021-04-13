package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Vaporize_286 : Card() {
    override val id = 286
    override val name = "蒸发"
    override val description = "<b>奥秘：</b>当一个随从攻击你的英雄，将其消灭。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy3
    override val background = "是不是因为死亡之翼的对手使用这张牌击败了他，所以他一怒之下引发了大灾变？我们不得而知。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0a47131c4adafa5f9e3acc587a63be1ecdbf3ecd5aead1329199f41fde71f89f.png"
}
