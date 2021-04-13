package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KeywardenIvory_61956 : Card() {
    override val id = 61956
    override val name = "钥匙守护者艾芙瑞"
    override val description = "<b>战吼：</b><b>发现</b>一张任意职业的双职业法术牌。<b>法术迸发：</b>获得发现的法术牌的另一张复制。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "她从她父亲那里只学到一件事：复制。"
    override val artist = "Anzka Nguyen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9373223d36710932bb4ed7bdf04ba12db875fcc8a1e698e5fd015713d1af7d5e.png"
}
