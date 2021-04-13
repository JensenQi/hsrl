package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ChiefInspector_47458 : Card() {
    override val id = 47458
    override val name = "总督察"
    override val description = "<b>战吼：</b>摧毁所有敌方<b>奥秘</b>。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "都给我靠墙站好放老实点！在我面前没有任何秘密！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4e80b44b66fcf6b38569f6c0e1c06d48a7df5bcc61545adc8d2dc9152aa805b8.png"
}
