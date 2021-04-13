package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BombSquad_40952 : Card() {
    override val id = 40952
    override val name = "爆破小队"
    override val description = "<b>战吼：</b>对一个敌方随从造成5点伤害。 <b>亡语：</b>对你的英雄造成5点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "千万别炸！千万别炸！千万别…轰！"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2d34b71fbbc9d51ae167ecfbd9a6eb06dc22ee9b123a6e66825c3309701d2604.png"
}
